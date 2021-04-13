package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaMind_49175 : Card() {
    override val id = 49175
    override val name = "欧米茄灵能者"
    override val description = "<b>战吼：</b>如果你有十个法力水晶，在本回合中你的所有法术具有 <b>吸血</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "代价就是掉头发和坐轮椅。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b51628608724d7088801cfcf787b352b9ece0005220f95a3b1a109c3308a417e.png"
}
