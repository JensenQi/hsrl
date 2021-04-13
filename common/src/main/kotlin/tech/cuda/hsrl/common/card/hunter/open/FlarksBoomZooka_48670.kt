package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlarksBoomZooka_48670 : Card() {
    override val id = 48670
    override val name = "弗拉克的火箭炮"
    override val description = "从你的牌库中召唤三个随从。他们会攻击敌方随从，然后死亡。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "本来火箭上绑的是塔布羊，后来换成了裂蹄牛。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e94ddd90ebdf448f8d18d674c5d6dcd88084f40e9c9b159730f6039e2a195ea.png"
}
