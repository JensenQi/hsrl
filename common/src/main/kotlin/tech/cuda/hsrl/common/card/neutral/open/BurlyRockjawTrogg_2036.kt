package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BurlyRockjawTrogg_2036 : Card() {
    override val id = 2036
    override val name = "石腭穴居人壮汉"
    override val description = "每当你的对手施放一个法术，获得 +2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他这么壮是因为他每天坚持健康的饮食，并且每个星期都去穴居人健身房进行锻炼。"
    override val artist = "Aleksi Briclot"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/719572d87903b82003feb42ad6d00a943af31f3603b655f09808f10cbeebd7c8.png"
}
