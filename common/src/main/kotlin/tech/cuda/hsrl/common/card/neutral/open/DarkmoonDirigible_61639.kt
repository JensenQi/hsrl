package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkmoonDirigible_61639 : Card() {
    override val id = 61639
    override val name = "暗月飞船"
    override val description = "<b>圣盾，腐蚀：</b>获得<b>突袭</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "木马非马，飞船非船。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/21943ccb3edb6e550b2f78339862e09a4e25dc6d18f62b15f93bfa20263f8aaa.png"
}
