package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClawMachine_61626 : Card() {
    override val id = 61626
    override val name = "娃娃机"
    override val description = "<b>突袭，亡语：</b>抽一张随从牌并使其获得+3/+3。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“姆咯啦咯啦，我被选中啦！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb3b953b4d3e322e712edc3414b1ce6cc086fb87fba3e30aff0092795bc6d4c1.png"
}
