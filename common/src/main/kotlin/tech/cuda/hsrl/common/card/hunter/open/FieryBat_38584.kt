package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FieryBat_38584 : Card() {
    override val id = 38584
    override val name = "炽炎蝙蝠"
    override val description = "<b>亡语：</b>随机对一个敌人造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "多亏了防火型护发素，炽炎蝙蝠才活到今天。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/348067d609df5dfde54f48cdb2fef2878d3492f26ece99d7447ed50734abd515.png"
}
