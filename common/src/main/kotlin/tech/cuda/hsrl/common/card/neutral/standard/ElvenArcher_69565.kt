package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElvenArcher_69565 : Card() {
    override val id = 69565
    override val name = "精灵弓箭手"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "媚眼如丝，轻盈如燕，致命如箭。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5007f95fa22d86992be88c34d907c61b60b79b3479261369f2369c30b620ea6.png"
}
