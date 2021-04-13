package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightforgedZealot_55068 : Card() {
    override val id = 55068
    override val name = "光铸狂热者"
    override val description = "<b>战吼：</b> 如果你的牌库中没有中立卡牌，便装备一把4/2的真银圣剑。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“唯有圣骑”俱乐部的注册会员。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0dbcef6318340b9995d0a9d5e847380c60cba58a0db29126afde0f279ff456c9.png"
}
