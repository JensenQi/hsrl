package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VulperaScoundrel_53413 : Card() {
    override val id = 53413
    override val name = "狐人恶棍"
    override val description = "<b>战吼：发现</b>一张法术牌或选择一个 神秘选项。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "法术就是法术，但神秘选项可以是任何法术！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d17af171649b871138a8dc02c447a5152fd9c374ee5c7a0fbea3c711be600a3.png"
}
