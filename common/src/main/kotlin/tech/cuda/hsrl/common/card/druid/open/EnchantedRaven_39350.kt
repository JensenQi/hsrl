package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnchantedRaven_39350 : Card() {
    override val id = 39350
    override val name = "魔法乌鸦"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Karazhan
    override val background = "年轻的麦迪文喜欢到处旅行，并在卡拉赞留下了许多情。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30a03345a3509698e40a3befabd414c16f9834bd9f12f4111b7bfc92004bfc32.png"
}
