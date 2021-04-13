package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SabretoothStalker_41415 : Card() {
    override val id = 41415
    override val name = "剑齿追猎者"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它喜欢用始祖龟的骨头来剔牙。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd323ab488ca34942c678032b12c8281debabbe5e354e53af8331e427aec017c.png"
}
