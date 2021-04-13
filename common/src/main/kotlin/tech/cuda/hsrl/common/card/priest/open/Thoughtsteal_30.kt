package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Thoughtsteal_30 : Card() {
    override val id = 30
    override val name = "思维窃取"
    override val description = "复制你对手的牌库中的两张牌，并将其置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "“人类喜欢说‘对牛弹琴’来形容白费功夫，哼，我们喜欢说‘对兽人使用思维窃取’！”——牛头人长者"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8d595ed648823f10cd1d7a673ed0ec24d89a163d9b3eb292b490e653461bbe2b.png"
}
