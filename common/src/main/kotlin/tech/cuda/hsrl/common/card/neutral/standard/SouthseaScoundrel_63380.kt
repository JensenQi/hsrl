package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaScoundrel_63380 : Card() {
    override val id = 63380
    override val name = "南海恶徒"
    override val description = "<b>战吼：</b>从你对手的牌库中<b>发现</b>一张牌。你的对手也会抽到<b>发现</b>的牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“……现在我们看到的就是南海恶徒和她的原生环境：充满罪恶与渣滓的窝点。”"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68bfa4045a2916e9a3a0f3af1659db66b39d324deacf3d98ad1760981ee8dc69.png"
}
