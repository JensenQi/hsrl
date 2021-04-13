package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Octosari_54147 : Card() {
    override val id = 54147
    override val name = "八爪巨怪"
    override val description = "<b>亡语：</b>抽八张牌。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "巨怪八爪，纷纷扬沙，紧紧缠敌，咻咻抽卡。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/845c18d70165b55add2cbae46f389dae04b992f4a23eeeddd7af89b020fee82d.png"
}
