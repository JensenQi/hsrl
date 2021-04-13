package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailCultist_38920 : Card() {
    override val id = 38920
    override val name = "血帆教徒"
    override val description = "<b>战吼：</b>如果你控制其他任何海盗，你的武器便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "血帆海盗之所以干这行，是因为想要一只属于自己的血帆鹦鹉。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84559491666adee8ce00f243906f0722d612faf370aa226b45b0bd52f5e0f9a1.png"
}
