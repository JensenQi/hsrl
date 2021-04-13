package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HagathasScheme_51373 : Card() {
    override val id = 51373
    override val name = "哈加莎的阴谋"
    override val description = "对所有随从造成 1点伤害。<i>（每回合都会升级！）</i>"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“所有人都将受苦！”“但是哈加莎，那些可是你的随从……”“我说了，是所有人！！！”"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae6e399cecaa9588f1c19a6e4526235200b3328ed2da67764bcfa0b15e88a0f1.png"
}
