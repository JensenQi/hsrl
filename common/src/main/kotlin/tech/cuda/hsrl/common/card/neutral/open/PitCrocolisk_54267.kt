package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitCrocolisk_54267 : Card() {
    override val id = 54267
    override val name = "深坑鳄鱼"
    override val description = "<b>战吼：</b>造成5点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "深坑！不是神坑！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2416b2b88e02254df6cf57505d2b749f67b080db08b958ff5385068dadf3d2be.png"
}
