package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallOfTheVoid_52263 : Card() {
    override val id = 52263
    override val name = "虚空召唤"
    override val description = "随机将一张恶魔牌置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "“长江长江，我是黄河！” “黄河黄河……” “谁敢召唤我？！”"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5a471795bf6c831ace22443c191dbfd7ee887d96ff97e62c896d46919ca4349.png"
}
