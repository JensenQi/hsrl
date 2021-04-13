package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBeastWithin_50644 : Card() {
    override val id = 50644
    override val name = "野兽之心"
    override val description = "使一个友方野兽获得+1/+1，使其随机攻击一个敌方随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "多年来的驯服成果毁于一旦。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a1b4167d42b12846edd59ddd42f5ef1b7277df99c5408972ab77c58a3571d62.png"
}
