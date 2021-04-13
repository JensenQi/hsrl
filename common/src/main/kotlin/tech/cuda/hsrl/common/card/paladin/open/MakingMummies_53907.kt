package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MakingMummies_53907 : Card() {
    override val id = 53907
    override val name = "制作木乃伊"
    override val description = "<b>任务：</b>使用5张<b>复生</b>牌。<b>奖励：</b>帝王裹布。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“我必须承认，每次制作木乃伊都会使我心有余悸！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8427bdc31bd0be538b7f011e37a15de0864bab465a1e32ab2aac49a4467f71a6.png"
}
