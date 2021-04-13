package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BeneathTheGrounds_2587 : Card() {
    override val id = 2587
    override val name = "危机四伏"
    override val description = "将三张伏击牌洗入你对手的牌库。当你的对手抽到该牌，便为你召唤一个4/4的蛛魔。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "能帮我拿一下这些蛛卵吗？我保证不会有什么奇奇怪怪的东西钻出来。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9da19d0054f00dda07901d116f20324bc7b13d354223d143bec3c547c9a97c1f.png"
}
