package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stampede_41360 : Card() {
    override val id = 41360
    override val name = "奔踏"
    override val description = "在本回合中，每当你使用一张野兽牌，随机将一张野兽牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "猎人们就喜欢这种乱哄哄一拥而上的感觉。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b3f1b51b2fc86c89c7de415f64c5bb8f3cf4fad96fdda06ac7ffdc2364e1037.png"
}
