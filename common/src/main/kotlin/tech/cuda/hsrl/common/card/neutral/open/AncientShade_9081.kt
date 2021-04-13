package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientShade_9081 : Card() {
    override val id = 9081
    override val name = "远古暗影"
    override val description = "<b>战吼：</b>将一张“远古诅咒”牌洗入你的牌库。当你抽到该牌，便会受到7点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "警告：切勿将其暴露在阳光直射下。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9117777e45ad9111c149f336848b805c6a3a4098ae64f65527e4b527c46beaa4.png"
}
