package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpittingCamel_54256 : Card() {
    override val id = 54256
    override val name = "乱喷的骆驼"
    override val description = "在你的回合结束时，随机对另一个友方随从造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "沙漠骆驼，痰吐不凡。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bdf3504fb10858cf787abc130fe43384afa70489d31da4b47bbdcc876098fa5.png"
}
