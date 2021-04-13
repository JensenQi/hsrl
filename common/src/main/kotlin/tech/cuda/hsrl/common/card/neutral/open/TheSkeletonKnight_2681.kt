package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheSkeletonKnight_2681 : Card() {
    override val id = 2681
    override val name = "骷髅骑士"
    override val description = "<b>亡语：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，则将骷髅骑士移回你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "别看没什么肌肉，挥起枪来劲还不小。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8929deb767fa60c786eb87e4e7a92a676bb762fe6ee634220c81a57a61322a61.png"
}
