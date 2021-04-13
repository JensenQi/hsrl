package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BeamingSidekick_54269 : Card() {
    override val id = 54269
    override val name = "欢快的同伴"
    override val description = "<b>战吼：</b>使一个友方随从获得+2生命值。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "放心吧！水，食物，帐篷，都带好了！还有被诅咒的猴爪！"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc6fa7d513f18ade131ad9d55f23894a4f775855834e51395766969e7e88f1b8.png"
}
