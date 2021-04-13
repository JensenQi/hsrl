package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoothsayersCaravan_62876 : Card() {
    override val id = 62876
    override val name = "占卜者车队"
    override val description = "在你的回合开始时，从你对手的牌库中复制一张法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "车棚坏了的时候，占卜者就成了粘补者。"
    override val artist = "Kai Zhong"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1e5c2519674004abfacbb0fab70e3af093da17ded47977c89ab64d031f9b035.png"
}
