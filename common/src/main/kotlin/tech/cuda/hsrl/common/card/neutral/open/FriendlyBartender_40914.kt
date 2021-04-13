package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FriendlyBartender_40914 : Card() {
    override val id = 40914
    override val name = "热心的酒保"
    override val description = "在你的回合结束时，为你的英雄恢复 1点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "你想来点啥？玉莲米酒，污手伏特加还是暗金马提尼？"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8a0e138af50e5263ea5825a070f2d28effae83353501c909301e2efbb455260e.png"
}
