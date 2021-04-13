package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VividNightmare_48002 : Card() {
    override val id = 48002
    override val name = "鲜活梦魇"
    override val description = "选择一个友方随从，召唤一个该随从的复制，且剩余生命值为1点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "“我梦到……我不小心合成了金色的米尔豪斯！这太可怕了！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0cbe050e1a80c7cccca2dfac03fe3a17928ecc45966acfa62780376a61fdf606.png"
}
