package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProudDefender_52418 : Card() {
    override val id = 52418
    override val name = "骄傲的防御者"
    override val description = "<b>嘲讽</b> 如果你没有其他随从，则具有+2攻 击力。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我们找个谦虚的进攻者来针对他。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/280d4ec31a236563d7b79eb60f0976fe8e2864381b3d6e6f081e19ac6eda38f2.png"
}
