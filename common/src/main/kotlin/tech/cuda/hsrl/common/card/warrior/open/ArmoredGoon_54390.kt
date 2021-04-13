package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArmoredGoon_54390 : Card() {
    override val id = 54390
    override val name = "重甲暴徒"
    override val description = "每当你的英雄攻击时，便获得5点 护甲值。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "全身重甲，头部、躯干、拳头和大腿这些无关紧要的部位除外。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a86af705b8184724e4f7b6058a791fd7dbc05f5bad291e8768d301f2b7b7860.png"
}
