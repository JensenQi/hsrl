package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FleethoofPearltusk_61674 : Card() {
    override val id = 61674
    override val name = "迅蹄珠齿象"
    override val description = "<b>突袭</b> <b>腐蚀：</b>获得+4/+4。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "游客参观的时长不同，互动体验也会不同。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e6a88b46f46008bfd691d5731bd95a464da18946d887919ca964388de7a345dc.png"
}
