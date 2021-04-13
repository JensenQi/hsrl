package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EchoOfMedivh_1941 : Card() {
    override val id = 1941
    override val name = "麦迪文的残影"
    override val description = "复制你的所有随从，并将其置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "麦迪文的残影徘徊于卡拉赞之中，这位昔日强大的守护者运用他的力量在下象棋和玩<i>炉石传说</i>时，不停地作弊。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4cbe64c9e6c18059ab9488ba7dbc32bc80612915fe03080303eb939ea8998e27.png"
}
