package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MicrotechController_49164 : Card() {
    override val id = 49164
    override val name = "微机操控者"
    override val description = "<b>战吼：</b>召唤两个1/1的微型机器人。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "畅销书《操纵你的朋友圈》作者。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14779756cee8188a7e5a5d56afe79598ebf3358d8225527f8a52bd513e3751a0.png"
}
