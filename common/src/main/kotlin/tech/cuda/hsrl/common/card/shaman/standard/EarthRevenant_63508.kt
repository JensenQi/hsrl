package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthRevenant_63508 : Card() {
    override val id = 63508
    override val name = "大地亡魂"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>对所有敌方随从造成1点 伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "你们谁看见一双石头腿了吗？就在这附近。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3e6135f570c10c6aaabec998aa64f256102391170c0b7cb0e6c0812a981b64c.png"
}
