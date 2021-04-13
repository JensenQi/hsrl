package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoodooHexxer_42762 : Card() {
    override val id = 42762
    override val name = "巫毒妖术师"
    override val description = "<b>嘲讽</b> <b>冻结</b>任何受到该随从伤害的角色。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "妖术师那恐怖的图腾让白银之手新兵们不寒而栗：那是一个被大头针钉住的小小雪人。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14aea6cffe47b7c328e71fb3443ca956e79b700fdc07e7fc20399a9ef2d33576.png"
}
