package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonConsort_2299 : Card() {
    override val id = 2299
    override val name = "龙王配偶"
    override val description = "<b>战吼：</b>你的下一张龙牌的法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Brm
    override val background = "我们所有生物都需要生命中的另一半。即便是巨大的、浑身长满鳞片的、狂野而致命的龙，也是如此。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08c14ab3864ea6ecf00d475f8c7ca24a517c5412651a1c5426e5819258fbc578.png"
}
