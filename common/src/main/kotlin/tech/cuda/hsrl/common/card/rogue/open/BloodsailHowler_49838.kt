package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailHowler_49838 : Card() {
    override val id = 49838
    override val name = "血帆啸猴"
    override val description = "<b>突袭</b>，<b>战吼：</b>你每控制一个其他海盗，便获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "我的意中人是个盖世英雄，总有一天，他会驾着海盗船来把你大卸八块。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2812f6b8f9d2c53a2e110f569f9cc7369af32ee3aaf42a985b5f7f63fb931cb.png"
}
