package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Adaptation_41944 : Card() {
    override val id = 41944
    override val name = "适者生存"
    override val description = "<b>进化</b>一个友方随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "要是祈求救赎没成功的话，就祈求长出更多的尖牙和利爪吧。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca94725e66d4dc0dfcef29f37362185afc2cc5a5ad334692a6c072c65b057664.png"
}
