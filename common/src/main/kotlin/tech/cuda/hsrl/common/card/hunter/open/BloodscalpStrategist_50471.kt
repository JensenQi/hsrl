package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodscalpStrategist_50471 : Card() {
    override val id = 50471
    override val name = "血顶战略家"
    override val description = "<b>战吼：</b>如果你装备着武器，<b>发现</b>一张 法术牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "与其说“打脸”是种<i>战略</i>，不如说是种<i>战术</i>。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f31b8e82105d762e4fb1c600decf7bca76ed31b22f49bb553900f47d4a6ec288.png"
}
