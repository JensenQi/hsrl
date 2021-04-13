package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaDefender_48508 : Card() {
    override val id = 48508
    override val name = "欧米茄防御者"
    override val description = "<b>嘲讽，战吼：</b>如果你有十个法力水晶，获得+10攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“投降吧，你有十个法力水晶的时间选择合作！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba3161fdeccc63c44f85926d0e6047371f6cb16efd8f293df78ad0e83fd7a07a.png"
}
