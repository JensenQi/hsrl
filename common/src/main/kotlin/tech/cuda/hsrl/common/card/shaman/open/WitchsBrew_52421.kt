package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchsBrew_52421 : Card() {
    override val id = 52421
    override val name = "女巫杂酿"
    override val description = "恢复 4点生命值。在本回合可以重复使用。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "隔汤有眼！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e014efb18e2120349d0f67db0cd84daf45d387ad7926e6f557a23b0284227ec7.png"
}
