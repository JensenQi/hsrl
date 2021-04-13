package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilGenius_52872 : Card() {
    override val id = 52872
    override val name = "怪盗天才"
    override val description = "<b>战吼：</b>消灭一个友方随从，随机将两张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "没人愿意被这个天才当枪使。"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cef6886fa8734ff64973f26067d6196d2eda63d3075b49393e36715658bde3bc.png"
}
