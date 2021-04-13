package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TroggzorTheEarthinator_2086 : Card() {
    override val id = 2086
    override val name = "颤地者特罗格佐尔"
    override val description = "每当你的对手施放一个法术，召唤一个石腭穴居人壮汉。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他不断震颤着大地，使山脉深处出现了大量洞穴，解决了穴居人的住房问题。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a392902d0d3e4fbfdf987ad7ce841d3adc68581562c7cb446508fad6788ce5c2.png"
}
