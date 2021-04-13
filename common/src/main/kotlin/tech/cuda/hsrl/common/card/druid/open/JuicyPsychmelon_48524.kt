package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JuicyPsychmelon_48524 : Card() {
    override val id = 48524
    override val name = "香甜的灵力瓜"
    override val description = "从你的牌库中抽取法力值消耗为（7），（8），（9）和（10）的随从牌各一张。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "瓜本身并不香甜，它只是麻痹了你的味觉。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbb31ce96e470ee55993b0f8d696e7e404e96849d6e0f8676c54577859ad0e39.png"
}
