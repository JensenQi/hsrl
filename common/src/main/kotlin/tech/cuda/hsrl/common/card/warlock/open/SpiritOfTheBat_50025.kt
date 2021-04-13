package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheBat_50025 : Card() {
    override val id = 50025
    override val name = "蝙蝠之灵"
    override val description = "<b>潜行</b>一回合。在一个友方随从死亡后，使你手牌中的一张随从牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "本身没有任何超能力，就是特有钱。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6e0f0066c31a96e7b934ddf0de2357a7a51583cca00e41a8dd4e595d12ebf52.png"
}
