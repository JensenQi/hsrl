package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Moonfang_61973 : Card() {
    override val id = 61973
    override val name = "月牙"
    override val description = "每次只能受到1点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“月额”这个名字听起来就不行。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e588c9faf97be174c1b9c287cd973f802c5d8756bdd479bb116a706e017f978.png"
}
