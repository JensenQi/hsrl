package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ReplicatOTron_57907 : Card() {
    override val id = 57907
    override val name = "复制机器人"
    override val description = "在你的回合结束时，将一个相邻的随从变形成为该随从的复制。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "据砰砰实验室的销售手册记载，这玩意“特别擅长推己及人”！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d82f01fbed5418e4e6f3a06def7fe69eb6e89502da3e077f5f12714a4d1b0a52.png"
}
