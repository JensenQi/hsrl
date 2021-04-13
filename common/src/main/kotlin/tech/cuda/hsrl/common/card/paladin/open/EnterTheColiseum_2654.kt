package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnterTheColiseum_2654 : Card() {
    override val id = 2654
    override val name = "精英对决"
    override val description = "除了每个玩家攻击力最高的随从之外，消灭所有 其他随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "想进场得穿过拥挤的人群，太多忙着购物的人把走道堵得水泄不通……"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5344bfa80ead4e7db105ba8fe745b8420d90485f1b7d8b6bb2b792cf077dc25b.png"
}
