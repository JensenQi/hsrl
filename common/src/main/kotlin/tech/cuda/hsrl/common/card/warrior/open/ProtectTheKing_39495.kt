package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProtectTheKing_39495 : Card() {
    override val id = 39495
    override val name = "保卫国王"
    override val description = "战场上每有一个敌方随从，便召唤一个1/1并具有<b>嘲讽</b>的 禁卫。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Karazhan
    override val background = "要想伤害国王，得先从我们的尸体上踏过去！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d36321e1fd879c27c42161583eeb891f6bf706d5fd917c47d7ebaf6b1cff3fbb.png"
}
