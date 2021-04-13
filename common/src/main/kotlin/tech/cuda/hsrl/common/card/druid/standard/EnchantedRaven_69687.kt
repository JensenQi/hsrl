package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnchantedRaven_69687 : Card() {
    override val id = 69687
    override val name = "魔法乌鸦"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "年轻的麦迪文喜欢到处旅行，并在卡拉赞留下了许多情。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8a7ff8f3455e7335f5fa5adebcc80438021c7ef2b41c8a57596186738dcf15f.png"
}
