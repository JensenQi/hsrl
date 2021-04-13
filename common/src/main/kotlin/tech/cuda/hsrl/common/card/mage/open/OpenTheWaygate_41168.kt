package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OpenTheWaygate_41168 : Card() {
    override val id = 41168
    override val name = "打开时空之门"
    override val description = "<b>任务：</b>施放8个你的套牌之外的 法术。 <b>奖励：</b>时空扭曲。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "这个咒语看似复杂，但只要往左跳一小步，再往右跳一小步，就完成施法了。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffb948f10784f15f21bb96e09c66874af2cf25f5c493a82e310857df257fa147.png"
}
