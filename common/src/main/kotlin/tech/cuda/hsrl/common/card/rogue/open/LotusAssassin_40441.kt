package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LotusAssassin_40441 : Card() {
    override val id = 40441
    override val name = "玉莲帮刺客"
    override val description = "<b>潜行</b>。每当该随从攻击并消灭一个随从时，便获得<b>潜行</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "只要5000金币和一个名字，玉莲帮就能为你解决掉他！岁末酬宾，买二赠一哟…"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f772f3ca1adf8a4453984ede59f85e5d4576acf8cf9fa258fd4712d7289a905.png"
}
