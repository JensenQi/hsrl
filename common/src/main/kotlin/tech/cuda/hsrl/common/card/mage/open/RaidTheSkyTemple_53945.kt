package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaidTheSkyTemple_53945 : Card() {
    override val id = 53945
    override val name = "洗劫天空殿"
    override val description = "<b>任务：</b>施放10个法术。 <b>奖励：</b>升格卷轴。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“我怎么就拿不住这些卷轴？”"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/35b0a69fcda985db353fcf0526f2349ebf4a641180c925be52051a34f1785001.png"
}
