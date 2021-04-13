package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SandstormElemental_53967 : Card() {
    override val id = 53967
    override val name = "沙暴元素"
    override val description = "<b>战吼：</b>对所有敌方随从造成1点伤害。 <b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "嘟嘟嘟嘟好嗨哟！"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ca18c4d148d6b7c48c80b9feb94f4d99aff7648812a4733a4be795761cc2587.png"
}
